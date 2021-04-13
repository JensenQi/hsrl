package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HarrisonJones_69974 : Card() {
    override val id = 69974
    override val name = "哈里森·琼斯"
    override val description = "<b>战吼：</b>摧毁对手的武器，并抽数量等同于其耐久度的牌。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“这东西应该陈列在探险者大厅里！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9b9b57f2c644f16fb3e6dda0cd42fea39ee69faee111e4944b40feb2c5f6c13b.png"
}
