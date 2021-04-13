package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlademasterSamuro_62587 : Card() {
    override val id = 62587
    override val name = "剑圣萨穆罗"
    override val description = "<b>突袭</b>，<b>暴怒：</b>对所有敌方随从造成等同于该随从攻击力的伤害。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "画家在作画时总是细心描摹，而剑圣在作画时更为大气。他们说这叫斧劈皴。"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/faa3eae25d4aef06f0d92a786994fb29100f45e55950169a5287df3709dda862.png"
}
