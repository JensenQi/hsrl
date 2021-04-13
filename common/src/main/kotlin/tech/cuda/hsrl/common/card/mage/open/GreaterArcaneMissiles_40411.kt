package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GreaterArcaneMissiles_40411 : Card() {
    override val id = 40411
    override val name = "强能奥术飞弹"
    override val description = "随机对敌人发射三枚飞弹，每枚飞弹造成 3点伤害。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Msog
    override val background = "天呐，我还以为奥术飞弹已经够强了呢！"
    override val artist = "Evgeniy Zaqumyennyy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5a900c5f046c4f208d9198818240cfcf33f525da05d093b5501410f1a4b1c53e.png"
}
