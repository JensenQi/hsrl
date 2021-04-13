package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlameLeviathan_1939 : Card() {
    override val id = 1939
    override val name = "烈焰巨兽"
    override val description = "当你抽到该牌时，对所有角色造成 2点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Gvg
    override val background = "米米尔隆最喜欢开着烈焰巨兽外出兜风。"
    override val artist = "Aleksi Briclot"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/388ba6dd6cfcac1005cd1ccdbb0547a8e1813a51cfa6192fdfbb9124f33b83f5.png"
}
