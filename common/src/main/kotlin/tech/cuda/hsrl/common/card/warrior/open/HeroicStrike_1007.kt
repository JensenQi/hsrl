package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HeroicStrike_1007 : Card() {
    override val id = 1007
    override val name = "英勇打击"
    override val description = "在本回合中，使你的英雄获得+4攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy1635
    override val background = "真英雄，必英勇，赶快使用英勇打击，做真英雄！"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/926c6c9b103c7a07b294e60700f6a29d84494b4492a9d79bd1cb702639216e31.png"
}
