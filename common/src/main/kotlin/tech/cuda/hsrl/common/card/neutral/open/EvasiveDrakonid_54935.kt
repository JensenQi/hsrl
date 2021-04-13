package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvasiveDrakonid_54935 : Card() {
    override val id = 54935
    override val name = "辟法龙人"
    override val description = "<b>嘲讽</b> 无法成为法术或英雄技能的目标。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "法术，英雄技能，还有电话，短信，统统不接。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/30ba7b69f5d0658280f21d936971da9705b24ac747d443ca814e0269b23d5b6c.png"
}
