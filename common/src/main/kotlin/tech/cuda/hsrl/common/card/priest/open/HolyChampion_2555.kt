package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyChampion_2555 : Card() {
    override val id = 2555
    override val name = "神圣勇士"
    override val description = "每当一个角色获得治疗，便获得 +2攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Tgt
    override val background = "她最爱做的事就是先把人打个半死，再帮那人慢慢恢复。"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e751de7bab60333de0c2e3617015ef4af4e192cb37ea18384bee95da290d41e.png"
}
