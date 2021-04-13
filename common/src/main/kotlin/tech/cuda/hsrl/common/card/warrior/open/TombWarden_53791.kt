package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TombWarden_53791 : Card() {
    override val id = 53791
    override val name = "陵墓守望者"
    override val description = "<b>嘲讽</b> <b>战吼：</b>召唤一个该随从的复制。"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "一个人守陵是有点冷清。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/974dd9b215cd74b5d9848da3c620096289feeefe629ab089fb1bbc9c290ce26f.png"
}
