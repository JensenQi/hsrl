package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PhantomMilitia_46634 : Card() {
    override val id = 46634
    override val name = "魅影民兵"
    override val description = "<b>回响，嘲讽</b>"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "这些家伙招募自吉尔尼斯歌剧院。"
    override val artist = "Dai Yang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fd44906e85cf1de09194249d41dfdfe1b20148190de0ce706956507ef094dfc8.png"
}
