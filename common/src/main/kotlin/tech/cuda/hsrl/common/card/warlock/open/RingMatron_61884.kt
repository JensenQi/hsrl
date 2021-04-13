package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RingMatron_61884 : Card() {
    override val id = 61884
    override val name = "火圈鬼母"
    override val description = "<b>嘲讽，亡语：</b>召唤两个3/2的小鬼。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "可平时小鬼都藏在哪呢？"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9eff1e9cdc46e0707b9d5ff43c3c7559c8d138241b14677a784f0ff666498604.png"
}
