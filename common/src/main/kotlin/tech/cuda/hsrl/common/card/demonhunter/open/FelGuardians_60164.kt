package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelGuardians_60164 : Card() {
    override val id = 60164
    override val name = "邪能护卫"
    override val description = "召唤三个1/2并具有<b>嘲讽</b>的恶魔。每当一个友方随从死亡，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "什么东西能保护恶魔的蹄子？邪能。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a18c9bdba5990d332e657e26c08bb4107d9678e9d61796fffb651d664e118f07.png"
}
