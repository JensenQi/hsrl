package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Stiltstepper_61135 : Card() {
    override val id = 61135
    override val name = "高跷艺人"
    override val description = "<b>战吼：</b>抽一张牌。如果你在本回合中使用抽到的牌，使你的英雄在本回合中获得+4攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "杂耍学校竞争残酷，有时你需要踩着别人才能登上高处。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/948db0bd6a7cb47d0a3d1fd256170aecd60469d90246b293b60322d7370068d2.png"
}
