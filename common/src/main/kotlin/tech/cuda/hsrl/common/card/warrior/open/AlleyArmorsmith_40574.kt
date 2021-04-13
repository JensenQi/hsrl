package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AlleyArmorsmith_40574 : Card() {
    override val id = 40574
    override val name = "兽人铸甲师"
    override val description = "<b>嘲讽</b> 每当该随从造成伤害时，获得等量的护甲值。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Msog
    override val background = "她每天凌晨4点就爬起来打铁了。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4f1281c440cc61a011755c47f83ac8fb1cfef3e2d1733697401bc0beef2cbe0f.png"
}
