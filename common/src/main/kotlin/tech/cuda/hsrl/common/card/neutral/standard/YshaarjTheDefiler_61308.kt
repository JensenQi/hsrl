package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YshaarjTheDefiler_61308 : Card() {
    override val id = 61308
    override val name = "亚煞极，污染之源"
    override val description = "<b>战吼：</b>将你在本局对战中使用过的每张<b>已腐蚀</b>牌的复制置入你的手牌。在本回合中，这些<b>已腐蚀</b>牌的法力值消耗为（0）点。"
    override var cost: Int? = 10
    override var health: Int? = 10
    override var attack: Int? = 10
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "亚煞极，典型的职场实习生：复制粘贴，污染一切。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/159e67acff1d1f111af46a1a0072e79c17658659caf124906a6b036c0977e53e.png"
}
