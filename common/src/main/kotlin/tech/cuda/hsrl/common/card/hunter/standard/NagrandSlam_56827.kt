package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NagrandSlam_56827 : Card() {
    override val id = 56827
    override val name = "纳格兰大冲撞"
    override val description = "召唤四只3/5的裂蹄牛并使其攻击随机敌人。"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "这在纳格兰属于合理冲撞！"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cace4da3f1198273d4c1b63f1a79dca62219c3541b8eb7216688c6c9c7c932e7.png"
}
