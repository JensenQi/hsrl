package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RobesOfProtection_59601 : Card() {
    override val id = 59601
    override val name = "防护长袍"
    override val description = "使你的所有随从获得“无法成为法术或英雄技能的目标。”"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "警告：防护长袍仅适用于指向性效果，不能有效抵御烈焰风暴，扭曲虚空或其他范围攻击。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aea253fab3739ecbc3e3fb0cc7ec91edf27ca6f4d97a405705d913953b641562.png"
}
