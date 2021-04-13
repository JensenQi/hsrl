package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EarthElemental_69627 : Card() {
    override val id = 69627
    override val name = "土元素"
    override val description = "<b>嘲讽</b>，<b>过载：</b>（2）"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "硬如磐石，坚不可破。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3cb30304bb1a0a255e4b388aec71c25cdb7578eebc27c19632ea9a10b623f182.png"
}
