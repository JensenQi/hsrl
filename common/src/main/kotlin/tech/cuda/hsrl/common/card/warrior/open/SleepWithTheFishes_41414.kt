package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SleepWithTheFishes_41414 : Card() {
    override val id = 41414
    override val name = "鱼死网破"
    override val description = "对所有受伤的随从造成 3点 伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Msog
    override val background = "污手党喜欢把那些在战斗中负伤的家伙扔到海里喂鱼，在解决对手的同时还省了一笔丧葬费。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/018cc8d9464bfb9b3e7f44d910106ba09d5c27d12e86b141dee96d1e5736be19.png"
}
