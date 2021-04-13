package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlackwaldPixie_47077 : Card() {
    override val id = 47077
    override val name = "黑樟林树精"
    override val description = "<b>战吼：</b>复原你的英雄技能。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "树精里的小王子。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f80273ef5f187ae9381a14fa68fe004839e4435b04079b4393c1436279003c8a.png"
}
