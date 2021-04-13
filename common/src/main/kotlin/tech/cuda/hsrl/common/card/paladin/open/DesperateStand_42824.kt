package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DesperateStand_42824 : Card() {
    override val id = 42824
    override val name = "殊死一搏"
    override val description = "使一个随从获得“<b>亡语：</b>回到战场，并具有1点生命值。”"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Kotf
    override val background = "虽然这些随从准备一搏，但没人准备先死。"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ce892fccfe583a9844c4818c8d20493ad2a69199634b0aef9577220a1d756ee2.png"
}
