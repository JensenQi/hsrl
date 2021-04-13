package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronHide_41401 : Card() {
    override val id = 41401
    override val name = "铜皮铁甲"
    override val description = "获得5点护甲值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Ungoro
    override val background = "第六周——我穿着这身外皮，没有人…噢不，是没有恐龙把我认出来。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0503c4fdf5e54d46e86bfc3c717ccc8c56c25a12c070723a2be899d6d220f841.png"
}
