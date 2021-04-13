package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChaosStrike_56791 : Card() {
    override val id = 56791
    override val name = "混乱打击"
    override val description = "在本回合中，使你的英雄获得+2攻击力。抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Legacy1635
    override val background = "“我们要什么？” “混乱！” “什么时候要？” “最意外的时候！”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b2381a4c8dd1f3999265fa8af90db6a5bf3f3940c4cf1f5ea935336d6a07be81.png"
}
