package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HoggerDoomOfElwynn_38944 : Card() {
    override val id = 38944
    override val name = "艾尔文灾星霍格"
    override val description = "每当该随从受到伤害，召唤一个2/2并具有<b>嘲讽</b>的豺狼人。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "克苏恩在睡前总会看看霍格有没有偷偷地藏在床底下。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/38240aa50b9e056ca9661281e05ff610606edbcd1ef35fa33ad448e91e3f0548.png"
}
