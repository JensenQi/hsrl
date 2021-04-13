package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Dreadsteed_2822 : Card() {
    override val id = 2822
    override val name = "恐惧战马"
    override val description = "<b>亡语：</b> 在回合结束时，召唤一匹恐惧战马。"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Tgt
    override val background = "Crescendo召唤出恐惧战马，驾着它冲向赛场。当他纵横驰骋时，总有一群骑手跟在身后，支持这位传奇勇士走向胜利。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bacf581d17d6ed1cc7b38f928ec2dfcf49325ed41134659196b98ac67703cab7.png"
}
