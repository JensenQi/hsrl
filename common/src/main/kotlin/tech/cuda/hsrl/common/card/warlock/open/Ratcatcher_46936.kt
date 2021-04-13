package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ratcatcher_46936 : Card() {
    override val id = 46936
    override val name = "捕鼠人"
    override val description = "<b>突袭，战吼：</b>消灭一个友方随从，并获得其攻击力和生命值。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.TheWitchwood
    override val background = "他正在帮托瓦格尔国王找寻其走失的老鼠。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/afe0bcffbdcdb6cdbd3090683e0d6831e5ca10eebb3d003c4b70d78d8fad2548.png"
}
