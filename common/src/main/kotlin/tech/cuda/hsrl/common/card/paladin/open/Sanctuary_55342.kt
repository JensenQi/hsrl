package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sanctuary_55342 : Card() {
    override val id = 55342
    override val name = "庇护"
    override val description = "<b>支线任务：</b> 在一回合内不受伤害。<b>奖励：</b>召唤一个3/6并具有<b>嘲讽</b>的随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.DescentOfDragons
    override val background = "缩在桌子底下就能完成的任务实在不多见。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2111e0d38bfc8a2e351b537f452cbd231fbbf0a76b291452c0138a53945b46aa.png"
}
