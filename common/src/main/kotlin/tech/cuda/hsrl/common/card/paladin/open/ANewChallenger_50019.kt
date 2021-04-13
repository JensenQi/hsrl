package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ANewChallenger_50019 : Card() {
    override val id = 50019
    override val name = "新人登场"
    override val description = "<b>发现</b>一张法力值消耗为（6）的随从牌。召唤该随从并使其获得<b>嘲讽</b>和<b>圣盾</b>。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RastakhansRumble
    override val background = "江山代有毒瘤出，各领天梯好几年。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ce87fa34d1e279bec81dbbdff43dad37d8eecaa0a84d3031b03c2bff04ae5f2f.png"
}
