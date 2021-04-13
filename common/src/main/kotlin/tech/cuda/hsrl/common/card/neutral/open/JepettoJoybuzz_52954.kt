package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JepettoJoybuzz_52954 : Card() {
    override val id = 52954
    override val name = "耶比托·乔巴斯"
    override val description = "<b>战吼：</b>从你的牌库中抽两张随从牌。将其攻击力，生命值和法力值消耗变为1。"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“现在我成了真正的玩具了！”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/54bf1b4cee5586902cef2576c9bc31fa92916bd64f883056abffe10c62397a84.png"
}
