package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrinceMalchezaar_39840 : Card() {
    override val id = 39840
    override val name = "玛克扎尔王子"
    override val description = "<b>对战开始时：</b>额外将五张<b>传说</b>随从牌置入你的牌库。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "玛克扎尔在一次淘旧货时买到了血吼。但是当他发现这把传奇武器是赝品时，气得把整个旧货市场都送进了扭曲虚空。"
    override val artist = "Joe Madureira & Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4d43e39cd05d681c486b5d5d4bb7b4a9bc13518eb2d07f77ff3abbc119e96ba2.png"
}
