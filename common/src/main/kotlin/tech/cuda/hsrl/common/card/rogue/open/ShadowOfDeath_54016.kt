package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowOfDeath_54016 : Card() {
    override val id = 54016
    override val name = "死亡之影"
    override val description = "选择一个随从。将三张“阴影”牌洗入你的牌库，当抽到“阴影”时，召唤该随从的一个复制。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "开棺有风险，交友须谨慎。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/02190f791c598e6b96249e3d479608b7059fee325e004bef453624e836d90535.png"
}
