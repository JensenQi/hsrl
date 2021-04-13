package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Felguard_517 : Card() {
    override val id = 517
    override val name = "恶魔卫士"
    override val description = "<b>嘲讽，战吼：</b>摧毁你的一个法力水晶。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "没错，他会为你而战，但并非心甘情愿。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/382a233f859d9b675c0f12c4f3e8474226a9a0d20e48a5f2c55e20bd7c007358.png"
}
