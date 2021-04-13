package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EarthElemental_1141 : Card() {
    override val id = 1141
    override val name = "土元素"
    override val description = "<b>嘲讽</b>，<b>过载：</b>（2）"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "硬如磐石，坚不可破。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/10a9cb4ada71c312627f667d9f4b44d98c634fa75447ee4c98fc71fcdd39397d.png"
}
