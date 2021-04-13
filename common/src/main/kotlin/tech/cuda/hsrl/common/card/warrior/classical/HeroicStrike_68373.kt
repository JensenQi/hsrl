package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HeroicStrike_68373 : Card() {
    override val id = 68373
    override val name = "英勇打击"
    override val description = "在本回合中，使你的英雄获得+4攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "真英雄，必英勇，赶快使用英勇打击，做真英雄！"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ff22c4c2c0f71336a201ccd7a81f1cbee2ba78707d8988ca1d3810b44e30b4eb.png"
}
