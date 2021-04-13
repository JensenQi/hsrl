package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bloodbloom_41872 : Card() {
    override val id = 41872
    override val name = "血色绽放"
    override val description = "在本回合中，你施放的下一个法术不再消耗法力值，转而消耗生命值。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Ungoro
    override val background = "你还在用法力施法？早就过时啦！"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c8486dcd60575b9eca72d1b0d73145188e7013e77197100146b252c97f7d85e.png"
}
