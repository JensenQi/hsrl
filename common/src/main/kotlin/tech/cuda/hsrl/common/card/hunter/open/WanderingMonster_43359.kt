package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WanderingMonster_43359 : Card() {
    override val id = 43359
    override val name = "游荡怪物"
    override val description = "<b>奥秘：</b> 当一个敌人攻击你的英雄时，随机召唤一个法力值消耗为（3）的随从，并使其成为攻击的目标。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "并非所有游荡者都迷失了自我。然而这个肯定是迷失了。"
    override val artist = "Trent Kaniuga & James Martin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0dd6a9f3e5a6ba6695b6428fb51e0f6db952a456ec5c01ca9eb4d96f186d5188.png"
}
