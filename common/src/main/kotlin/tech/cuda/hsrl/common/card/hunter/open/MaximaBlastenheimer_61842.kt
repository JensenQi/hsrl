package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MaximaBlastenheimer_61842 : Card() {
    override val id = 61842
    override val name = "玛克希玛·雷管"
    override val description = "<b>战吼：</b>从你的牌库中召唤一个随从，使其攻击敌方英雄，然后死亡。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "信不信由你，这个游戏在马戏团的玩命排行榜中仅列第四位。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6e871aed11ea2b9555d95e9d64f9aa3cda1691ceff427a79fcbdf8e780d3977e.png"
}
