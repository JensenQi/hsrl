package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarsongWrangler_63088 : Card() {
    override val id = 63088
    override val name = "战歌驯兽师"
    override val description = "<b>战吼：</b>从你的牌库中<b>发现</b>一张野兽牌。使其所有的复制获得+2/+1<i>（无论它们在哪）</i>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“你问我最喜欢的野兽？我对我所有的野兽一视同仁！”"
    override val artist = "Angelica Alieva"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/37b0d0666581485ba01aca4d71595b64330250696655cdaeb79f02b0f9e45454.png"
}
