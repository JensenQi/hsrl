package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KolkarPackRunner_63007 : Card() {
    override val id = 63007
    override val name = "科卡尔驯犬者"
    override val description = "在你施放一个法术后，召唤一只1/1并具有<b>突袭</b>的土狼。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "如果他摔倒了，该说是人仰还是马翻？"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d224cbd069a767d0bea955ea137cdfedb52a4c804ede9464623a2a608d89215e.png"
}
