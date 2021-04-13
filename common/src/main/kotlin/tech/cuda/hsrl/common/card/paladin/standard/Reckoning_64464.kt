package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Reckoning_64464 : Card() {
    override val id = 64464
    override val name = "清算"
    override val description = "<b>奥秘：</b>在一个敌方随从造成3点或以上伤害后，将其消灭。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "后来，他的头衔变成了“卡末，卡扎克的末日”。"
    override val artist = "L. Lullabi & A. Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1fa8ec2582dbd3e7470b39090684f6b31c3bfadbab8140c0bd0585b34dc15e99.png"
}
