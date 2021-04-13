package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlameImp_1090 : Card() {
    override val id = 1090
    override val name = "烈焰小鬼"
    override val description = "<b>战吼：</b>对你的英雄造成3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "小鬼们喜欢引火上身。它们就是喜欢。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d1b570e4e44df0e3989861685a98947ba5e51c593dd068a23c98fc030d2426aa.png"
}
