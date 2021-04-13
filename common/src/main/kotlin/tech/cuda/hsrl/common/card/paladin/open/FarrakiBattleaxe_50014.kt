package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FarrakiBattleaxe_50014 : Card() {
    override val id = 50014
    override val name = "法拉基战斧"
    override val description = "<b>超杀：</b>使你手牌中的一张随从牌 获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RastakhansRumble
    override val background = "诸事无常，唯死亡与利斧永恒。"
    override val artist = "M. Alvares & M. Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/33746bfe771a40ce24f93530c5a90a20dd72f0f9da915891903cfaf749bd8bf5.png"
}
