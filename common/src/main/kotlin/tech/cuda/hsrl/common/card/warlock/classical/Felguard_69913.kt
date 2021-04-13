package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Felguard_69913 : Card() {
    override val id = 69913
    override val name = "恶魔卫士"
    override val description = "<b>嘲讽，战吼：</b>摧毁你的一个法力水晶。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "没错，他会为你而战，但并非心甘情愿。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a0026f44704f37a9a3058bbc01bc0c973754a6ddf89438dc57adedda3445391e.png"
}
