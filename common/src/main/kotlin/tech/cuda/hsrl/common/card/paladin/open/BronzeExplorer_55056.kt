package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BronzeExplorer_55056 : Card() {
    override val id = 55056
    override val name = "青铜龙探险者"
    override val description = "<b>吸血</b> <b>战吼：</b><b>发现</b>一张 龙牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.DescentOfDragons
    override val background = "时刻期待着发现新的朋友。不包括死亡之翼。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/658ec20ab776648cdeba0be183b2a1ff4a435f299e37b274e1fae986903c0064.png"
}
