package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AugmentedPorcupine_56398 : Card() {
    override val id = 56398
    override val name = "强能箭猪"
    override val description = "<b>亡语：</b> 造成等同于该随从攻击力的伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "上吧，爆壳猛猪，扎透他们！"
    override val artist = "Charlene Le Scanff"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba86ade7f3d7d9b298fa818ea1118caf041a9210e9566fb83123cb091dd6320a.png"
}
