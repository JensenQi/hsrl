package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurlocTidehunter_976 : Card() {
    override val id = 976
    override val name = "鱼人猎潮者"
    override val description = "<b>战吼：</b>召唤一个1/1的鱼人斥候。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "“死亡之潮升涌而起！”"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/65c5a8deb15b71b7b9fb66515a61a29de164a005bcd0864d9ac210ddab9aaf03.png"
}
