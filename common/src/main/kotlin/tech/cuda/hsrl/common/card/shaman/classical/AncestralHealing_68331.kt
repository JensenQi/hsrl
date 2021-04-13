package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncestralHealing_68331 : Card() {
    override val id = 68331
    override val name = "先祖治疗"
    override val description = "为一个随从恢复所有生命值并使其获得<b>嘲讽</b>。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "你能在战斗中召唤祖先的灵魂！所以，出生在一个强大的家族是很重要的！"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4d8a9139d49313a8ff79933f84324702a0e628ebe18b40e7ba38190a08fe4b96.png"
}
