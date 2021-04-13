package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CobaltGuardian_2030 : Card() {
    override val id = 2030
    override val name = "钴制卫士"
    override val description = "每当你召唤一个机械，便获得<b>圣盾</b>。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Gvg
    override val background = "过去这些“卫士”们都是用真银打造的，但自从把生产线外包给加基森的厂家之后，他们的材质就发生了改变。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7917f755bff700105b40156ea761c29772504b016f5b1975fdf2316e95c65c19.png"
}
