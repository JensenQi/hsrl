package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wanted_47625 : Card() {
    override val id = 47625
    override val name = "通缉令"
    override val description = "对一个随从造成 3点伤害。如果“通缉令”消灭该随从，将一个幸运币置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.TheWitchwood
    override val background = "重金悬赏：无论死不死。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4afbc3d7f1889ed0cb9e08546fa57c21b9867375c587d5c09c836d1cb47e2d54.png"
}
