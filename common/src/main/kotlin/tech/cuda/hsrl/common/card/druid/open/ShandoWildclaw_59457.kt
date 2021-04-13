package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShandoWildclaw_59457 : Card() {
    override val id = 59457
    override val name = "大导师野爪"
    override val description = "<b>抉择：</b>使你牌库中的所有野兽牌获得+1/+1；或者变形成为一只友方野兽的复制。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "她同时占据着校园里的两块板：黑板和猫抓板。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ae56f39b819c3e9ed083b797f4df303ff4d1c8d890c0de46ec0d766ef9c3a7a4.png"
}
