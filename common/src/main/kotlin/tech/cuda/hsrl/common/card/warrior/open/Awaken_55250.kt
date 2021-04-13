package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Awaken_55250 : Card() {
    override val id = 55250
    override val name = "祈求觉醒"
    override val description = "<b>祈求</b>迦拉克隆。对所有随从造成 1点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.DescentOfDragons
    override val background = "这就是一张关不掉的闹钟。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3115cbd6da2df4640703b472f8480eb24baa171ab2bb8003edb1eaec60a00575.png"
}
