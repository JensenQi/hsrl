package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrushingHand_43322 : Card() {
    override val id = 43322
    override val name = "粉碎之手"
    override val description = "对一个随从造成 8点伤害。 <b>过载：</b>（3）"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "和萨满祭司握手时千万要多加小心。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f96dd3eda1ce892f6b83fca61878c75eed8ac6f1d0315fa9718c9a42cdfe7426.png"
}
