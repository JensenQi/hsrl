package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BerylliumNullifier_48142 : Card() {
    override val id = 48142
    override val name = "铍金毁灭者"
    override val description = "<b>磁力</b> 无法成为法术或英雄技能的目标。"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.BoomsdayProject
    override val background = "为什么要用铍？因为这个字难拼，进而难以被选中。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68049daa69ebdbae78f56818b42c670810b58f684efe2f3031ed80047fd88244.png"
}
