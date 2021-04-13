package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoontouchedAmulet_61602 : Card() {
    override val id = 61602
    override val name = "月触项链"
    override val description = "在本回合中，使你的英雄获得+4攻击力。<b>腐蚀：</b>并获得6点护甲值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "被太阳触摸过的项链化掉了。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/18bb3dd3ed9fbfcd057babe6d889ea3caae38f382e784fc901ce8837066d380c.png"
}
