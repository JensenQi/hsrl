package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HarrisonJones_912 : Card() {
    override val id = 912
    override val name = "哈里森·琼斯"
    override val description = "<b>战吼：</b>摧毁对手的武器，并抽数量等同于其耐久度的牌。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "“这东西应该陈列在探险者大厅里！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a83a7e9537845bf8301f0633f60d41b00b2591d1934613ff37c6dadfefe6a44.png"
}
