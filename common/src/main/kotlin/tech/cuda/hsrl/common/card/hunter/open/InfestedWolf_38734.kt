package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InfestedWolf_38734 : Card() {
    override val id = 38734
    override val name = "寄生恶狼"
    override val description = "<b>亡语：</b>召唤两只1/1的蜘蛛。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Wotog
    override val background = "听说除虱粉对治疗这种寄生感染有奇效。"
    override val artist = "E. Guiton & A. Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/138344e98f90b67ce575e64cb653b59f9f5432238999a6f58eef99380b8621d8.png"
}
